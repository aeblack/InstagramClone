package com.example.anthonyevans.instagramclone;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by anthonyevans on 2/28/17.
 */

public class FeedFragment extends Fragment  {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.id.fragment_feed, container, false);
    }
}
