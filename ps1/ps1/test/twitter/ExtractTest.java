/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package twitter;

import static org.junit.Assert.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.junit.Test;

public class ExtractTest {

   
    private static final Instant d1 = Instant.parse("2016-02-17T10:00:00Z");
    private static final Instant d2 = Instant.parse("2016-02-17T11:00:00Z");
    private static final Instant d6 = Instant.parse("2018-03-17T10:47:00Z");
    
    private static final Tweet tweet1 = new Tweet(1, "alyssa", "is it reasonable to talk about rivest so much?", d1);
    private static final Tweet tweet2 = new Tweet(2, "bbitdiddle", "rivest talk in 30 minutes #hype", d2);
	@Test
    public void testGetEmptyTweet() {
        Timespan timespan = Extract.getTimespan(new ArrayList<Tweet>());
        assertEquals(timespan.getEnd(), timespan.getStart());         
    }



public void testGetTimespan_OneTweet() {
    Timespan timespan = Extract.getTimespan(Arrays.asList(tweet1));
    
    assertEquals("Expected start == end",
            timespan.getStart(), timespan.getEnd());
    assertEquals("Expected start == d1",
            timespan.getStart(), d1);
} 
    @Test
    public void testGetTimespanTwoTweets() {
        Timespan timespan = Extract.getTimespan(Arrays.asList(tweet1, tweet2));
        
        assertEquals("expected start", d1, timespan.getStart());
        assertEquals("expected end", d2, timespan.getEnd());
    }
    
     
    @Test
    public void testGetTimespanFiveTweets() {
        Object tweet3 = null;
		Object tweet4 = null;
		Object tweet5 = null;
		Timespan timespan = Extract.getTimespan(Arrays.asList(tweet1, tweet2, tweet3,tweet4,tweet5));

        assertEquals(d1, timespan.getStart());
        Object d5 = null;
		assertEquals(d5, timespan.getEnd());
    }
    @Test
    public void testGetTimespanSixTweets() {
        Object tweet3 = null;
		Object tweet4 = null;
		Object tweet5 = null;
		Object tweet6 = null;
		Timespan timespan = Extract.getTimespan(Arrays.asList(tweet1, tweet2, tweet3,tweet4,tweet5,tweet6));

        assertEquals(d1, timespan.getStart());
        assertEquals(d6, timespan.getEnd());
    }
    
    @Test
    
    public void testGetMentionedUsersNoMention() {
    	 
    	Set<String> mentionedUsers = Extract.getMentionedUsers(Arrays.asList(tweet1));

        assertTrue("expected empty set", mentionedUsers.isEmpty());

	

	/**
	 * @param mentionedUsers
	 *            the mentionedUsers to set
	 */
	
	}

	
	

		public static Timespan getTimespan(java.util.List<Tweet> asList) {
			// TODO Auto-generated method stub
			return null;
		}
	}


