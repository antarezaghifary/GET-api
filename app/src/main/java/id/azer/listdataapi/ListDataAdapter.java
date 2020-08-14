package id.azer.listdataapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListDataAdapter extends RecyclerView.Adapter<ListDataAdapter.ListViewHolder>{
    public final List<Response> dosens;
    public OnItemClickCallback onItemClickCallback;

    public ListDataAdapter(List<Response> dosen) {
        this.dosens = dosen;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListDataAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ListDataAdapter.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListDataAdapter.ListViewHolder holder, int position) {
        final Response dosen = dosens.get(position);
        holder.textView1.setText(dosen.getArti());
        holder.textView2.setText(dosen.getNama());
    }

    @Override
    public int getItemCount() {
        return (dosens != null) ? dosens.size() : 0;
    }
    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView textView1,textView2;

        ListViewHolder(View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.tv_satu);
            textView2 = itemView.findViewById(R.id.tv_dua);
        }
    }
}

