package org.example;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Publisher<String> {

    private List<String> videos = new ArrayList<>();

    @Override
    public void subscribe(Subscriber<? super String> subscriber) {
        subscriber.onSubscribe(new YoutubeSubscription(subscriber, videos));
    }

    public void addVideo(String title) {
        videos.add(title);
    }
}
