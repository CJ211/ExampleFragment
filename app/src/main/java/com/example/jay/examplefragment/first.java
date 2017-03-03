package com.example.jay.examplefragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class first extends Fragment {

    EditText mMessage;
    Button msubmitbtn;
    private OnFragmentInteractionListener mListener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.first_fragment, container, false);

        mMessage = (EditText) view.findViewById(R.id.editext);
        msubmitbtn = (Button) view.findViewById(R.id.button1);

        msubmitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mSend = mMessage.getText().toString();
                onButtonClick(mSend);
            }
        });

        return view;//return view
    }

    public void onButtonClick(String msg)
    {
        if(mListener!=null)
        {
            mListener.onFragmentInteraction(msg);
        }
    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        try {
            mListener=(OnFragmentInteractionListener)context ;
        }
        catch (ClassCastException e){

        }
    }

    public interface OnFragmentInteractionListener
    {
         void onFragmentInteraction(String msg);
    }
}
