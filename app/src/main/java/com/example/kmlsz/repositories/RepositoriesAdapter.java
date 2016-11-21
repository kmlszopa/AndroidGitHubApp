package com.example.kmlsz.repositories;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kmlsz on 21.11.2016.
 */

public class RepositoriesAdapter extends RecyclerView.Adapter<RepositoriesAdapter.RepositoryViewHolder> {
    private List<GitHubRepository> mData;

    public void setmData(List<GitHubRepository> mData) {
        this.mData = mData;
    }

    @Override
    public RepositoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // LayoutInflaster - komponent do tworzenia obiektów View na podstawie plików XML (R.layout.XXX)
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        // Metoda inflate tworzy obiekt View na podstawie podanego pluku XML
        // Drugi jej prametr to kontener względem którego ma wymierowac nowo tworzony widok
        // Trzeci parametr mowi czy chcemu nowo tworzony widok dodac od razu do parent.
        View rowView = inflater.inflate(android.R.layout.simple_list_item_1,parent, false);
        return new RepositoryViewHolder(rowView);
    }

    @Override
    public void onBindViewHolder(RepositoryViewHolder holder, int position) {
        // 1. Pobierz dane z zadanej pozycji (parametr position)
        GitHubRepository repository = mData.get(position);
        // 2. Uzupełnij widok wiersza (parametr holder) danymi
       holder.mLabel.setText(repository.getName());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class RepositoryViewHolder extends RecyclerView.ViewHolder{
        TextView mLabel;

        public RepositoryViewHolder(View itemView) {
            super(itemView);
            mLabel = (TextView) itemView.findViewById(android.R.id.text1);

        }
    }
}
