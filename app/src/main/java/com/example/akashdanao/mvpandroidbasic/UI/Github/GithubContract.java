package com.example.akashdanao.mvpandroidbasic.UI.Github;

/**
 * Created by akash.danao on 18/01/18.
 */

public class GithubContract {

    public interface Presenter {

        public void getStarredRepos();
    }

    public interface View {
        public void showStarredRepos();
    }
}
