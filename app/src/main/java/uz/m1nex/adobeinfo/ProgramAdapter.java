package uz.m1nex.adobeinfo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ProgramViewHolder> {

    public List<Program> programList;
    private final Context context;
    public boolean orientation = false;

    public ProgramAdapter(Context context, List<Program> programList) {
        this.context = context;
        this.programList = programList;
    }

    @NonNull
    @Override
    public ProgramViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if (!orientation){
            view = LayoutInflater.from(context).inflate(R.layout.item_program, parent, false);
        } else {
            view = LayoutInflater.from(context).inflate(R.layout.item_program2, parent, false);
        }
        return new ProgramViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramViewHolder holder, int position) {
        Program program = programList.get(position);
        holder.imageView.setImageResource(program.getImgResId());
        holder.title.setText(program.getProgramName());
        holder.type.setText(program.getType());
        holder.root.setBackgroundTintList(ColorStateList.valueOf(program.getColor()));
        holder.itemView.setOnClickListener(v -> {
            ((MainActivity) context).openDetailScreen(programList.get(position).getImgResId());
        });
    }

    @Override
    public int getItemCount() {
        return programList.size();
    }

    static class ProgramViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title;
        TextView type;
        LinearLayout root;

        ProgramViewHolder(View itemView) {
            super(itemView);
            root = itemView.findViewById(R.id.root);
            imageView = itemView.findViewById(R.id.img);
            title = itemView.findViewById(R.id.title);
            type = itemView.findViewById(R.id.type);
        }
    }
}
