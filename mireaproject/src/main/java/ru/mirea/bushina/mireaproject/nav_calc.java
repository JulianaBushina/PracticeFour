package ru.mirea.bushina.mireaproject;

import android.nfc.Tag;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import static android.content.ContentValues.TAG;
import static android.service.autofill.Validators.and;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link nav_calc#newInstance} factory method to
 * create an instance of this fragment.
 */
public class nav_calc extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private String calculates = "";
    public nav_calc() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment nav_calc.
     */
    // TODO: Rename and change types and number of parameters
    public static nav_calc newInstance(String param1, String param2) {
        nav_calc fragment = new nav_calc();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nav_calc, container, false);
        TextView area = (TextView) view.findViewById(R.id.area);
        Button button_0 = (Button) view.findViewById(R.id.btn_0);
        Button button_1 = (Button) view.findViewById(R.id.btn_1);
        Button button_2 = (Button) view.findViewById(R.id.btn_2);
        Button button_3 = (Button) view.findViewById(R.id.btn_3);
        Button button_4 = (Button) view.findViewById(R.id.btn_4);
        Button button_5 = (Button) view.findViewById(R.id.btn_5);
        Button button_6 = (Button) view.findViewById(R.id.btn_6);
        Button button_7 = (Button) view.findViewById(R.id.btn_7);
        Button button_8 = (Button) view.findViewById(R.id.btn_8);
        Button button_9 = (Button) view.findViewById(R.id.btn_9);
        Button button_plus = (Button) view.findViewById(R.id.btn_plus);
        Button button_minus = (Button) view.findViewById(R.id.btn_minus);
        Button button_mult = (Button) view.findViewById(R.id.btn_mult);
        Button button_dev = (Button) view.findViewById(R.id.btn_devid);
        // Button button_dot = (Button) view.findViewById(R.id.btn_dot);
        Button button_equal = (Button) view.findViewById(R.id.btn_equal);
        Button button_clear = (Button) view.findViewById(R.id.btn_clear);
        Button button_cleardigit = (Button) view.findViewById(R.id.btn_clearDigit);

        button_0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((calculates.length() == 0) || (calculates == "0")){
                    calculates = "0";
                }
                else{
                    calculates += "0";
                }
                area.setText(calculates);
                // Log.d(TAG, String.valueOf(calculates.length()));
            }
        });
        button_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((calculates.length() == 0) || (calculates == "0")){
                    calculates = "1";
                }
                else{
                    calculates += "1";
                }
                area.setText(calculates);
            }
        });
        button_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((calculates.length() == 0) || (calculates == "0")){
                    calculates = "2";
                }
                else{
                    calculates += "2";
                }
                area.setText(calculates);
            }
        });
        button_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((calculates.length() == 0) || (calculates == "0")){
                    calculates = "3";
                }
                else{
                    calculates += "3";
                }
                area.setText(calculates);
            }
        });
        button_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((calculates.length() == 0) || (calculates == "0")){
                    calculates = "4";
                }
                else{
                    calculates += "4";
                }
                area.setText(calculates);
            }
        });
        button_5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((calculates.length() == 0) || (calculates == "0")){
                    calculates = "5";
                }
                else{
                    calculates += "5";
                }
                area.setText(calculates);
            }
        });
        button_6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((calculates.length() == 0) || (calculates == "0")){
                    calculates = "6";
                }
                else{
                    calculates += "6";
                }
                area.setText(calculates);
            }
        });
        button_7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((calculates.length() == 0) || (calculates == "0")){
                    calculates = "7";
                }
                else{
                    calculates += "7";
                }
                area.setText(calculates);
            }
        });
        button_8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((calculates.length() == 0) || (calculates == "0")){
                    calculates = "8";
                }
                else{
                    calculates += "8";
                }
                area.setText(calculates);
            }
        });
        button_9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((calculates.length() == 0) || (calculates == "0")){
                    calculates = "9";
                }
                else{
                    calculates += "9";
                }
                area.setText(calculates);
                // Log.d(TAG, String.valueOf(calculates.length()));
            }
        });

        //

        button_plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(calculates.length() == 0){
                    calculates = calculates;
                }
                else if((calculates.charAt(calculates.length() - 1) == '/') ||
                        (calculates.charAt(calculates.length() - 1) == '*') ||
                        (calculates.charAt(calculates.length() - 1) == '+') ||
                        (calculates.charAt(calculates.length() - 1) == '-')){
                    calculates = calculates;
                }
                else{
                    calculates += "+";
                }
                area.setText(calculates);
                // Log.d(TAG, String.valueOf(calculates.length()));
            }
        });
        button_minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(calculates.length() == 0){
                    calculates = calculates;
                }
                else if((calculates.charAt(calculates.length() - 1) == '/') ||
                        (calculates.charAt(calculates.length() - 1) == '*') ||
                        (calculates.charAt(calculates.length() - 1) == '+') ||
                        (calculates.charAt(calculates.length() - 1) == '-')){
                    calculates = calculates;
                }
                else{
                    calculates += "-";
                }
                area.setText(calculates);
                // Log.d(TAG, String.valueOf(calculates.length()));
            }
        });
        button_mult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(calculates.length() == 0){
                    calculates = calculates;
                }
                else if((calculates.charAt(calculates.length() - 1) == '/') ||
                        (calculates.charAt(calculates.length() - 1) == '*') ||
                        (calculates.charAt(calculates.length() - 1) == '+') ||
                        (calculates.charAt(calculates.length() - 1) == '-')){
                    calculates = calculates;
                }
                else{
                    calculates += "*";
                }
                area.setText(calculates);
                // Log.d(TAG, String.valueOf(calculates.length()));
            }
        });
        button_dev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(calculates.length() == 0){
                    calculates = calculates;
                }
                else if((calculates.charAt(calculates.length() - 1) == '/') ||
                (calculates.charAt(calculates.length() - 1) == '*') ||
                        (calculates.charAt(calculates.length() - 1) == '+') ||
                        (calculates.charAt(calculates.length() - 1) == '-')){
                    calculates = calculates;
                }
                else{
                    calculates += "/";
                }
                area.setText(calculates);
                // Log.d(TAG, String.valueOf(calculates.length()));
            }
        });



        //

        button_clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calculates = "";
                area.setText(calculates);

            }
        });
        button_cleardigit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (calculates.length() == 0){
                    calculates = calculates;
                }
                else{
                    calculates = calculates.substring(0, calculates.length() - 1);
                }
                area.setText(calculates);
            }
        });

        //

        button_equal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String number_before = "", number_after = "";
                char oper;
                double result;
                for(int i = 0;;i++){
                    if(isNumeric(String.valueOf(calculates.charAt(i)))){
                        number_before += calculates.charAt(i);
                    }
                    else{
                        oper = calculates.charAt(i);
                        for(int j = i + 1;;j++){
                            try{
                                if(isNumeric(String.valueOf(calculates.charAt(j)))){
                                    number_after += calculates.charAt(j);
                                }
                                else{
                                    break;
                                }
                            }catch(Exception e){
                                break;
                            }

                        }
                        break;
                    }
                }
                switch (oper){
                    case ('/'):
                        result = Double.parseDouble(number_before) / Double.parseDouble(number_after);
                        calculates = String.valueOf(result);
                        break;
                    case ('+'):
                        result = Double.parseDouble(number_before) + Double.parseDouble(number_after);
                        calculates = String.valueOf(result);
                        break;
                    case ('-'):
                        result = Double.parseDouble(number_before) - Double.parseDouble(number_after);
                        calculates = String.valueOf(result);
                        break;
                    case ('*'):
                        result = Double.parseDouble(number_before) * Double.parseDouble(number_after);
                        calculates = String.valueOf(result);
                        break;
                }
                area.setText(calculates);
            }


        });

        return view;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}