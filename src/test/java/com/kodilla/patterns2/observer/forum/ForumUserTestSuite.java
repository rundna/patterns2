package com.kodilla.patterns2.observer.forum;

import observer.forum.ForumTopic;
import observer.forum.ForumUser;
import observer.forum.JavaHelpForumTopic;
import observer.forum.JavaToolsForumTopic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ForumUserTestSuite {

    @Test
    public void testUpdate(){
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser ivone = new ForumUser("Ivone");
        ForumUser jessie = new ForumUser("Jessie");
        javaHelpForum.registerObserver(ivone);
        javaToolsForum.registerObserver(ivone);
        javaToolsForum.registerObserver(jessie);

        javaHelpForum.addPost("Hi");
        javaHelpForum.addPost("Hello");
        javaToolsForum.addPost("Again Hi");
        javaToolsForum.addPost("Yet hi");
        javaHelpForum.addPost("Bye");

        assertEquals(5, ivone.getUpdateCount());
        assertEquals(2, jessie.getUpdateCount());

    }


}
