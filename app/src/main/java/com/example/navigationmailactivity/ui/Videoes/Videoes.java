package com.example.navigationmailactivity.ui.Videoes;

import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.navigationmailactivity.R;

public class Videoes extends Fragment {

    private VideoesViewModel mViewModel;

    public static Videoes newInstance() {
        return new Videoes();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
     View view=   inflater.inflate(R.layout.videoes_fragment, container, false);
        MediaController mc= new MediaController(getActivity());

        VideoView  videoView = view.findViewById(R.id.videoView);
        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.nature;
        videoView.setVideoURI(Uri.parse(path));
        videoView.setMediaController(mc);
        videoView.start();
     /* VideoView  videoView = view.findViewById(R.id.videoView);
        videoView.setMediaController(new MediaController(getContext()));
        Uri video = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + R.raw.nature);
        videoView.setVideoURI(video);
        videoView.start();*/
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(VideoesViewModel.class);
        // TODO: Use the ViewModel
    }

}
