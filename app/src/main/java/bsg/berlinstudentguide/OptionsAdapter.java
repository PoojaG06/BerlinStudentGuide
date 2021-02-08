package bsg.berlinstudentguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class OptionAdapter extends RecyclerView.Adapter<OptionAdapter.ViewHolder>
{
    private final ArrayList<Options> option;
    ItemClicked activity;

    public interface ItemClicked
    {
        void ItemClicked(int index);
    }


    public OptionAdapter (Context context, ArrayList<Options> list)
    {

        option = list;
        activity = (ItemClicked) context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvOption;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvOption = itemView.findViewById(R.id.tvOption);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.ItemClicked(option.indexOf(v.getTag()));
                }
            });

        }
    }

    @NonNull
    @Override
    public OptionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull OptionAdapter.ViewHolder holder, int position) {

        holder.itemView.setTag(option.get(position));

        holder.tvOption.setText(option.get(position).getType());
    }

    @Override
    public int getItemCount() {
        return option.size();
    }
}
