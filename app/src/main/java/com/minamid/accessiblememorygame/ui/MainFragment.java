package com.minamid.accessiblememorygame.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.minamid.accessiblememorygame.R;
import com.minamid.accessiblememorygame.base.CustomFragment;
import com.minamid.accessiblememorygame.util.Config;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainFragment extends CustomFragment {

    @BindView(R.id.welcomeMessage) TextView welcomeMessage;
    @BindView(R.id.button_start_game) Button button_start_game;
    @BindView(R.id.button_settings) Button button_settings;
    @BindView(R.id.imageView) ImageView imageView;
    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        welcomeMessage.setContentDescription(getString(R.string.contentDescription_text_welcome, welcomeMessage.getText(), Config.timeBoardRevealed));

        button_start_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateTo(GameBoardFragment.newInstance(), true);
            }
        });

        button_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Create the settings screen
                // TODO: Option for sound after Matching
                // TODO: Create a option to stop announcing the card position
                // TODO: Configurations using Preference Manager
                // TODO: Maybe create different set of pictures
                // TODO: Create difficulty levels which may involve time and trials
                // Practice: As many, tries | 60 seconds
                // Easy: 8 errors, 40 seconds
                // Normal: 5 errors, 30 seconds
                // Hard: 3 errors, 25 seconds
                // Pro: 0 errors, 15 seconds
                // TODO: Create feature to unlock new difficulty levels
                //navigateTo(SettingsFragment.newInstance(1), true);
            }
        });

        bindImage(imageView, R.drawable.accessible_memory_game_logo_gray_3);

    }

    private void bindImage(ImageView imageView, int resourceId) {
        Glide.with(getContext())
                .load(resourceId)
                .into(imageView);
    }

}
