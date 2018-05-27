package com.example.ksenia.an_lab_2;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.TextView;
import java.util.Date;

public class ContentFragment  extends Fragment {


    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_content, container, false);

            Button updateButton = (Button) view.findViewById(R.id.button);
            final TextView updateBox = (TextView) view.findViewById(R.id.selection);

            updateButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String curDate = new Date().toString();
                    updateBox.setText(selection);
                }
            });
            return view;
        }

}
