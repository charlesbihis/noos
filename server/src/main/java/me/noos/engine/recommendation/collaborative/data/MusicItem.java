/**
 * 
 */
package me.noos.engine.recommendation.collaborative.data;


import java.util.ArrayList;

import me.noos.engine.recommendation.collaborative.model.Item;
import me.noos.engine.recommendation.collaborative.model.Rating;

/**
 * Item for music dataset.
 * 
 * @author bmarmanis
 */
public class MusicItem extends Item {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3219691524340585231L;
	
	String artist;
	
	public MusicItem(int id, String name) {
		super(id, name, new ArrayList<Rating>(3));
	}

	
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
}
