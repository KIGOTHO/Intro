package com.creatives.mike.intro;



public class MyIntro extends AppIntro {

    // Please DO NOT override onCreate. Use init
    @Override
    public void init(Bundle savedInstanceState) {

        // Add your slide's fragments here

        // AppIntro will automatically generate the dots indicator and buttons.


      
        
        setVibrate(true);
        setVibrateIntensity(30);
    }
    @Override
    public void onSkipPressed() {
        // Do something when users tap on Skip button.
    }

    @Override
    public void onDonePressed() {
        // Do something when users tap on Done button.
    }
}