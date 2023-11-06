package br.com.fescfafic.av4ex2.Main;

import br.com.fescfafic.av4ex2.Model.AudioPlayer;
import br.com.fescfafic.av4ex2.Model.VideoPlayer;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();

        audioPlayer.play();
        audioPlayer.pause();
        audioPlayer.stop();

        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();
    }
}