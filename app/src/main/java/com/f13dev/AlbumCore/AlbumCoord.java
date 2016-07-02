/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f13dev.AlbumCore;

import java.util.*;

/**
 *
 * @author jamesvalentine
 */
public class AlbumCoord {
    private Set<Artist> artists;
    private Set<Album> albums;
    
    /**
     * Creates a new album coordinator.
     * 
     * @param none
     */
    public AlbumCoord()
    {
        this.artists = new TreeSet<Artist>();
        this.albums = new TreeSet<Album>();
        
    }

    /**
     * @return the artists
     */
    public Set<Artist> getArtists() {
        return artists;
    }

    /**
     * @return the albums
     */
    public Set<Album> getAlbums() {
        return albums;
    }
    
    /**
     * Sets artists Set to the argument
     * @param artists 
     */
    public void setArtists(Set<Artist> artists)
    {
        this.artists = artists;
    }
    
    /**
     * Adds a new artist using the argument
     * @param aName 
     */
    public void addArtist(String aName)
    {
        Set<Artist> temp = this.getArtists();
        temp.add(new Artist(aName));
        this.setArtists(temp);
        
    }
    
    /**
     * Returns the artist name for the argument
     * @param anArtist
     * @return the name of anArtist
     */
    public String getArtistName(Artist anArtist)
    {
        return anArtist.getName();
    }
    
    /**
     * Returns the set of albums associated with the argument
     * @param anArtist
     * @return Set<Album>
     */
    public Set<Album> getArtistAlbums(Artist anArtist)
    {
        return anArtist.getAlbums();
    }
    
    /**
     * Removes the artist of the argument
     * @param anArtist
     * @param anAlbum 
     */
    public void removeArtistAlbum(Artist anArtist, Album anAlbum)
    {
        anArtist.removeAlbum(anAlbum);
    }
    
    /**
     * Sets the album set to the argument
     * @param albums 
     */
    public void setAlbums(Set<Album> albums)
    {
        this.albums = albums;
    }
    
    /**
     * Creates a new Album object using the arguments
     * @param aTitle
     * @param anArtist
     * @param isOwned 
     */
    public void addAlbum(String aTitle, String anArtist, boolean isOwned)
    {
        Set<Album> temp = this.getAlbums();
        for (Artist eachArtist : this.getArtists())
        {
            if (eachArtist.getName() == anArtist)
            {
                temp.add(new Album(aTitle, eachArtist, isOwned));
            }
        }
        this.setAlbums(temp);
    }
    
    /**
     * Returns the title of the album in the argument
     * @param anAlbum
     * @return anAlbum title
     */
    public String getAlbumTitle(Album anAlbum)
    {
        return anAlbum.getTitle();
    }
    
    /**
     * Returns the owned value of the album in the argument
     * @param anAlbum
     * @return anAlbum owned
     */
    public boolean isAlbumOwned(Album anAlbum)
    {
        return anAlbum.isOwned();
    }
    
    /**
     * Sets the owned value of the album in the argument
     * @param anAlbum
     * @param isOwned 
     */
    public void setAlbumOwned(Album anAlbum, boolean isOwned)
    {
        anAlbum.setOwned(isOwned);
    }
    
    /**
     * Returns the artist associated with the album in the argument
     * @param anAlbum
     * @return Artist
     */
    public Artist getAlbumArtist(Album anAlbum)
    {
        return anAlbum.getArtist();
    }
    
    /**
     * Returns the set of all albums marked as owned
     * @return Set<Album>
     */
    public Set<Album> getAlbumsOwned()
    {
        TreeSet<Album> temp = new TreeSet<>();
        for (Artist eachArtist : this.getArtists())
        {
            for (Album eachAlbum : eachArtist.getAlbums())
            {
                if (eachAlbum.isOwned() == true)
                {
                    temp.add(eachAlbum);
                }
            }
        }
        return temp;
    }
    
    /**
     * Returns the set of all albums marked as not owned
     * @return Set<Album>
     */
    public Set<Album> getAlbumsWanted()
    {
        TreeSet<Album> temp = new TreeSet<>();
        for (Artist eachArtist : this.getArtists())
        {
            for (Album eachAlbum : eachArtist.getAlbums())
            {
                if (eachAlbum.isOwned() == false)
                {
                    temp.add(eachAlbum);
                }
            }
        }
        return temp;
    }
    
}
