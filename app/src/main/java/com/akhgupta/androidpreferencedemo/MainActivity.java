package com.akhgupta.androidpreferencedemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment implements View.OnClickListener {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            view.findViewById(R.id.setButton).setOnClickListener(this);
            view.findViewById(R.id.getButton).setOnClickListener(this);
        }

        public void onSetButtonClick()
        {
            EditText editText= (EditText) getActivity().findViewById(R.id.stringEdit);
            MyAppPreference.getInstance().setSampleStringKey(editText.getText().toString());
        }
        public void onGetButtonClick()
        {
            TextView textView = (TextView) getActivity().findViewById(R.id.stringText);
            textView.setText(MyAppPreference.getInstance().getSampleStringKey());
        }

        @Override
        public void onClick(View view) {
            switch (view.getId())
            {
                case R.id.setButton:onSetButtonClick(); break;
                case R.id.getButton:onGetButtonClick(); break;
            }
        }
    }
}