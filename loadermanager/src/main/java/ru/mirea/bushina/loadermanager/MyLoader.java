package ru.mirea.bushina.loadermanager;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.loader.content.AsyncTaskLoader;
import java.util.ArrayList;
import java.util.Collections;


public class MyLoader extends AsyncTaskLoader<String> {
    public final String TAG = this.getClass().getSimpleName();
    private String firstName;
    public static final String ARG_WORD = "word";
    public MyLoader(@NonNull Context context, Bundle args) {
        super(context);
        if (args != null)
            firstName = args.getString(ARG_WORD);
    }
    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }
    @Override
    public String loadInBackground() {
        ArrayList<Character> firstName_list = new ArrayList<>();
        for (int i = 0; i < firstName.length();i++){
            firstName_list.add(firstName.charAt(i));
        }
        String firstName_string = "";
        Collections.shuffle(firstName_list);
        for (int i = 0; i < firstName_list.size();i++){
            firstName_string += firstName_list.get(i);
        }
        return firstName_string;
    }
}
