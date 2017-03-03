package com.example.jay.examplefragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class second extends Fragment {

    private TextView mReceivedmsg;

    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.second_fragment,container,false);
        mReceivedmsg= (TextView) view.findViewById(R.id.rtxt);
        return view;
    }
    public void receivedinfo(String txt)
    {
        mReceivedmsg.setText(txt);
    }

}
