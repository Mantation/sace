package menuFragments.registration;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bombo.sace.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class step4 extends Fragment {
View myview;

    public step4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myview = inflater.inflate(R.layout.fragment_step4, container, false);
        return myview;
    }

}
