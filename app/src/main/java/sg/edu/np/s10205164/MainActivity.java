package sg.edu.np.s10205164;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void SetFollowBtnTxt(User user, Button FollowBtn){

        if (user.isFollowed()){
            FollowBtn.setText("Unfollow");
            Toast.makeText(getApplicationContext(),"Follow", Toast.LENGTH_SHORT).show();
        }
        else{
            FollowBtn.setText("Follow");
            Toast.makeText(getApplicationContext(),"Unfollowed", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("debug","create");
        User user1 = new User("temp","temp",0,false);
        Button FollowBtn = findViewById(R.id.follow);
        SetFollowBtnTxt(user1,FollowBtn);

        FollowBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                user1.ToggleFollow();
                SetFollowBtnTxt(user1,FollowBtn);
            }
        });

        Intent in = getIntent();
        String randomNo = in.getStringExtra("randomNo");
        TextView textView = findViewById(R.id.textView);
        textView.setText("MAD " + randomNo);

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("debug","start");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("debug","resume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("debug","pause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("debug","stop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("debug","destroy");
    }
}