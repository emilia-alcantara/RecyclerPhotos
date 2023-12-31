package cl.individual.recyclerphotos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.List;
import cl.individual.recyclerphotos.databinding.ItemBinding;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.MyViewHolder> {
    private List<PhotoModel> photoGallery;


    public void setPhotoGallery(List<PhotoModel> photoGallery) {
        this.photoGallery = photoGallery;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final PhotoModel photo = photoGallery.get(position);
        Picasso.get()
                .load(photo.getImgLink())
                .error(com.google.android.material.R.drawable.mtrl_ic_error)
                .into(holder.imgItem);
    }

    @Override
    public int getItemCount() {
        return photoGallery.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ItemBinding binding;
        private ImageView imgItem;


        public MyViewHolder(ItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            imgItem = binding.imgItem;
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            // Obtención de la posición del item seleccionado
            int position = getLayoutPosition();

            // Obtención del link de la imagen específica y su descripción
            String imgLink = String.valueOf(photoGallery.get(position).getImgLink());
            String imgDescription = String.valueOf(photoGallery.get(position).getImgDetail());

            // Creación de un Bundle para entregar la información al siguiente fragmento
            Bundle newBundle = new Bundle();
            newBundle.putString("link", imgLink);
            newBundle.putString("details", imgDescription);

            // Navegación al segundo fragmento entregando la información de lo que se tiene que mostrar
            Navigation.findNavController(binding.getRoot()).navigate(R.id.action_galleryFragment_to_detailFragment, newBundle);
        }
    }

}
