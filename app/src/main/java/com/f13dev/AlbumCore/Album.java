/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f13dev.AlbumCore;

/**
 *
 * @author jamesvalentine
 */
public class Album implements Comparable<Album> {
    private final String title;
    private boolean owned;
    private final Artist artist;
    
    Album(String aTitle, Artist anArtist, boolean isOwned)
    {
        this.title = aTitle;
        this.artist = anArtist;
        this.owned = isOwned;
        anArtist.addAlbum(this);
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the owned
     */
    public boolean isOwned() {
        return owned;
    }

    /**
     * @param owned the owned to set
     */
    public void setOwned(boolean owned) {
        this.owned = owned;
    }

    /**
     * @return the artist
     */
    public Artist getArtist() {
        return artist;
    }
    
    @Override
    public int compareTo(Album o) {
        return this.getTitle().compareTo(o.getTitle());
    }
    
    @Override
    public String toString()
    {
        return this.getArtist().getName()
                + " "
                + this.getTitle()
                + " | owned = "
                + this.isOwned();
    }

}
