package org.example;

public class Main {
    public static void main(String[] args)
    {
        YoutubeChannel channel = new YoutubeChannel();

        channel.addVideo("Reactive Programming with Java");
        channel.addVideo("Introduction to Machine Learning");
        channel.addVideo("Web Development Basics");

        User userSubscriber = new User("Diego");

        channel.subscribe(userSubscriber);
    }
}