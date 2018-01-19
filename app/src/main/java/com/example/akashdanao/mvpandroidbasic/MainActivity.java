package com.example.akashdanao.mvpandroidbasic;

import android.os.Binder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.akashdanao.mvpandroidbasic.UI.Github.GithubContract;
import com.example.akashdanao.mvpandroidbasic.UI.Github.GithubPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity implements GithubContract.View{

    private GithubContract.Presenter presenter;
    String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.btn_fetch_git)
    Button buttonFetchGit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new GithubPresenter(this);

    }

    @OnClick(R.id.btn_fetch_git)
    public void getGitRepo(View view){
        presenter.getStarredRepos();
    }

    @Override
    public void showStarredRepos() {
        Toast.makeText(this, " MVP start ", Toast.LENGTH_SHORT).show();
    }
}
