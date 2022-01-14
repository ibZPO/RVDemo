package edu.ib.rvdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder> {
    private  TennisPlayer [] players;

    public PlayerAdapter(TennisPlayer[] players) {
        this.players = players;
    }

    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View listItem=layoutInflater.inflate(R.layout.player_row,parent,false);
        PlayerViewHolder playerViewHolder= new PlayerViewHolder(listItem);
        return playerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder holder, int position) {
        holder.imPhoto.setImageResource(players[position].getImageID());
        holder.tvName.setText(players[position].getName());

    }

    @Override
    public int getItemCount() {
        return players.length;
    }

    public class PlayerViewHolder extends RecyclerView.ViewHolder{
        ImageView imPhoto;
        TextView  tvName;
        public PlayerViewHolder(@NonNull View itemView) {
            super(itemView);
            imPhoto=itemView.findViewById(R.id.ivPhoto);
            tvName=itemView.findViewById(R.id.tvName);
        }
    }
}
