package com.pecpecker.pecapp;

import com.pecpecker.pecapp.models.Message;
import com.pecpecker.pecapp.models.User;

/**
 * Created by User on 1/24/2018.
 */

public interface IMainActivity {

    void inflateViewProfileFragment(User user);

    void onMessageSelected(Message message);

    void onBackPressed();


}
