package edu.ib.rvdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        String [] names=getResources().getStringArray(R.array.names);
        TennisPlayer []players=new TennisPlayer[]{

                new TennisPlayer(names[0], R.drawable.barty),
                new TennisPlayer(names[1], R.drawable.sabalenka),
                new TennisPlayer(names[2], R.drawable.muguruza),
                new TennisPlayer(names[3], R.drawable.krejcikova),
                new TennisPlayer(names[4], R.drawable.pliskova),
                new TennisPlayer(names[5], R.drawable.sakkari),
                new TennisPlayer(names[6], R.drawable.kontaveit),
                new TennisPlayer(names[7], R.drawable.swiatek),
                new TennisPlayer(names[8], R.drawable.badosa),
                new TennisPlayer(names[9], R.drawable.jabeur),

        };


        RecyclerView rvPlayers= findViewById(R.id.RVPlayers);
        PlayerAdapter adapter = new PlayerAdapter(players);
        rvPlayers.setHasFixedSize(true);
        rvPlayers.setLayoutManager(new LinearLayoutManager(this));
        rvPlayers.setAdapter(adapter);

    }
}