package io.github.haohaozaici.muititypelearning.testandroidstudio;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by haoyuan on 2017/10/12.
 */

public class TestFragment extends Fragment {



  public static TestFragment newInstance() {

    Bundle args = new Bundle();

    TestFragment fragment = new TestFragment();
    fragment.setArguments(args);
    return fragment;
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }
}
