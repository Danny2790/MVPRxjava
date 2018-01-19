package com.example.akashdanao.mvpandroidbasic.UI.Github;

/**
 * Created by akash.danao on 18/01/18.
 */

public class GithubPresenter implements GithubContract.Presenter {

    private GithubContract.View view;

    public GithubPresenter(GithubContract.View view){
        this.view = view;
    }

    @Override
    public void getStarredRepos() {
        view.showStarredRepos();
    }
}
