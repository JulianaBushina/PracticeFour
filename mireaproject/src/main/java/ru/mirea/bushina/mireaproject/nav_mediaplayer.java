package ru.mirea.bushina.mireaproject;

import android.content.ContentUris;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link nav_mediaplayer#newInstance} factory method to
 * create an instance of this fragment.
 */
public class nav_mediaplayer extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    int current_music_num = 0;
    public nav_mediaplayer() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment nav_mediaplayer.
     */
    // TODO: Rename and change types and number of parameters
    public static nav_mediaplayer newInstance(String param1, String param2) {
        nav_mediaplayer fragment = new nav_mediaplayer();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private Bitmap getAlbumImage(String path) {
        android.media.MediaMetadataRetriever mmr = new MediaMetadataRetriever();
        mmr.setDataSource(path);
        byte[] data = mmr.getEmbeddedPicture();
        if (data != null) return BitmapFactory.decodeByteArray(data, 0, data.length);
        return null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nav_mediaplayer, container, false);
        Button playpause = (Button)view.findViewById(R.id.play);;
        Button prev = (Button)view.findViewById(R.id.button);
        Button next = (Button)view.findViewById(R.id.button2);
        TextView current_name = (TextView)view.findViewById(R.id.textView3);
        List<String> musiclist;
        musiclist = new ArrayList<>();

        Field[] fields = R.raw.class.getFields();
        for(int i = 0; i < fields.length; i++){
            musiclist.add(fields[i].getName());
        }

        int sound_1 = getActivity().getResources().getIdentifier(String.valueOf(musiclist.get(0)), "raw",
                getActivity().getPackageName());
        int sound_2 = getActivity().getResources().getIdentifier(String.valueOf(musiclist.get(1)), "raw",
                getActivity().getPackageName());
        int sound_3 = getActivity().getResources().getIdentifier(String.valueOf(musiclist.get(2)), "raw",
                getActivity().getPackageName());
        int sound_4 = getActivity().getResources().getIdentifier(String.valueOf(musiclist.get(3)), "raw",
                getActivity().getPackageName());
        final MediaPlayer[] music = new MediaPlayer[musiclist.size()];
        music[0] = MediaPlayer.create(getContext(), sound_1);
        music[1] = MediaPlayer.create(getContext(), sound_2);
        music[2] = MediaPlayer.create(getContext(), sound_3);
        music[3] = MediaPlayer.create(getContext(), sound_4);
        
        playpause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                current_name.setText(musiclist.get(current_music_num));
                if(music[current_music_num].isPlaying()){
                    playpause.setText("Play");
                    music[current_music_num].pause();
                }

                else{
                    playpause.setText("Pause");
                    music[current_music_num].setLooping(true);
                    music[current_music_num].start();
                }

            }
        });

        prev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                music[current_music_num].pause();
                music[current_music_num].seekTo(0);
                if(current_music_num == 0){
                    current_music_num = musiclist.size() - 1;
                }
                else{
                    current_music_num--;
                }
                current_name.setText(musiclist.get(current_music_num));
                music[current_music_num].start();

            }
        });

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                music[current_music_num].pause();
                music[current_music_num].seekTo(0);
                if(current_music_num == musiclist.size() - 1){
                    current_music_num = 0;
                }
                else{
                    current_music_num++;
                }
                current_name.setText(musiclist.get(current_music_num));
                music[current_music_num].start();

            }
        });

        return view;
    }


}