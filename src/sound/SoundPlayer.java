package sound;

import java.util.HashMap;
import java.util.Map;

import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;

public class SoundPlayer {
	private Map<String, Sound> audioMap;
	private Map<String, Music> musicMap;
	private boolean songplaying;
	private String playingSong;
	
	public SoundPlayer()
	{
		audioMap = new HashMap<String, Sound>();
		musicMap = new HashMap<String, Music>();
		songplaying = false;
		playingSong = "";
	}
	
	public void playSoundfx(String audioTag, boolean loop, float pitch, float gain)
	{
		Sound effect = audioMap.get(audioTag);
		
		effect.play(pitch, gain);
		
		if(loop)
		{
			effect.loop();
		}
	}
	
	public void stopFX(String audioTag)
	{
		Sound effect = audioMap.get(audioTag);
		effect.stop();
	}
	
	public void playSong(String audioTag, boolean loop, float pitch, float gain)
	{
		this.stopMusic();
		
		Music newSong = musicMap.get(audioTag);
		
		newSong.play();
		playingSong = audioTag;
		songplaying = true;
		
		if(loop)
		{
			newSong.loop();
		}
	}
	
	public void stopMusic()
	{
		if(songplaying)
		{
			Music oldSong = musicMap.get(playingSong);
			oldSong.stop();
			songplaying = false;
			playingSong = "";
		}
	}
	
	public void loadSound(String audioTag, String audioLoc) throws SlickException
	{
		Sound newSound = new Sound(audioLoc);
		
		audioMap.put(audioTag, newSound);
	}
	
	public void loadMusic(String audioTag, String audioLoc) throws SlickException
	{
		Music newSound = new Music(audioLoc);
		
		musicMap.put(audioTag, newSound);
	}
}
