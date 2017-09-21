package com.xw.samlpe.bubbleseekbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xw.repo.BubbleSeekBar;

/**
 * DemoFragment3
 * <><p/>
 * Created by woxingxiao on 2017-03-11.
 */

public class DemoFragment3 extends Fragment {

    public static DemoFragment3 newInstance() {
        return new DemoFragment3();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_demo_3, container, false);
        BubbleSeekBar bubbleSeekBar1 = (BubbleSeekBar) view.findViewById(R.id.demo_3_seek_bar_1);
        final BubbleSeekBar bubbleSeekBar2 = (BubbleSeekBar) view.findViewById(R.id.demo_3_seek_bar_2);
        BubbleSeekBar bubbleSeekBar3 = (BubbleSeekBar) view.findViewById(R.id.demo_3_seek_bar_3);
        BubbleSeekBar bubbleSeekBar4 = (BubbleSeekBar) view.findViewById(R.id.demo_3_seek_bar_4);

        bubbleSeekBar1.getConfigBuilder()
                .min(2f)
                .max(7f)
                .floatType()
                .setFloatPrecision(3)
                .sectionCount(10)
                .touchToSeek()
                .sectionTextInterval(2)
                .trackColor(ContextCompat.getColor(getContext(), R.color.color_red_light))
                .secondTrackColor(ContextCompat.getColor(getContext(), R.color.color_red))
                .showSectionText()
                .showThumbText()
                .sectionTextPosition(BubbleSeekBar.TextPosition.BELOW_SECTION_MARK)
                .build();

        bubbleSeekBar2.getConfigBuilder()
                .min(0)
                .max(5f)
                .floatType()
                .setFloatPrecision(3)
                .sectionCount(10)
                .touchToSeek()
                .sectionTextInterval(2)
                .trackColor(ContextCompat.getColor(getContext(), R.color.color_red_light))
                .secondTrackColor(ContextCompat.getColor(getContext(), R.color.color_red))
                .showSectionText()
                .showThumbText()
                .sectionTextPosition(BubbleSeekBar.TextPosition.BELOW_SECTION_MARK)
                .build();

        bubbleSeekBar3.getConfigBuilder()
                .min(1)
                .max(50f)
                .floatType()
                .secondTrackColor(ContextCompat.getColor(getContext(), R.color.color_green))
                .showSectionText()
                .showThumbText()
                .touchToSeek()
                .setFloatPrecision(2)
                .build();

        bubbleSeekBar4.getConfigBuilder()
                .min(-0.4f)
                .max(0.4f)
                .progress(0)
                .floatType()
                .sectionCount(10)
                .sectionTextInterval(2)
                .touchToSeek()
                .showSectionText()
                .sectionTextPosition(BubbleSeekBar.TextPosition.BELOW_SECTION_MARK)
                .autoAdjustSectionMark()
                .build();

        bubbleSeekBar1.setOnProgressChangedListener(new BubbleSeekBar.OnProgressChangedListener() {
            @Override
            public void onProgressChanged(int progress, float progressFloat) {
                bubbleSeekBar2.setProgress(progressFloat);
            }

            @Override
            public void getProgressOnActionUp(int progress, float progressFloat) {

            }

            @Override
            public void getProgressOnFinally(int progress, float progressFloat) {

            }
        });

        return view;
    }

}
