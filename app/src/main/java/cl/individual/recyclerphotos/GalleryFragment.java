package cl.individual.recyclerphotos;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import cl.individual.recyclerphotos.databinding.FragmentGalleryBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GalleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GalleryFragment extends Fragment{
    private FragmentGalleryBinding binding;
    List<PhotoModel> data = getData();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public GalleryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GalleryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GalleryFragment newInstance(String param1, String param2) {
        GalleryFragment fragment = new GalleryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentGalleryBinding.inflate(getLayoutInflater(),container, false);
        initRecycler();

        return binding.getRoot();
    }

    private void initRecycler() {

        GalleryAdapter galleryAdapter = new GalleryAdapter();

        galleryAdapter.setPhotoGallery(data);

        binding.recGallery.setAdapter(galleryAdapter);
    }


    private List<PhotoModel> getData() {
        ArrayList<PhotoModel> photoGallery = new ArrayList<>();
        photoGallery.add(new PhotoModel("https://images.unsplash.com/photo-1689072503598-638956beee7d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=660&q=80",
                "Una iglesia en el medio de un campo bajo el cielo nocturno estrellado"));

        photoGallery.add(new PhotoModel("https://images.unsplash.com/photo-1682687220742-aba13b6e50ba?ixlib=rb-4.0.3&ixid=M3wxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHwxMXx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60",
                "Foto de una persona parada en la cima de una colina rocosa"));

        photoGallery.add(new PhotoModel("https://images.unsplash.com/photo-1688725755373-10d1bb23b55d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80",
                "Una persona caminando por una calle sosteniendo un paraguas"));

        photoGallery.add(new PhotoModel("https://images.unsplash.com/photo-1689089764982-3c081cc0089a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw0NXx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60",
                "Una mujer parada frente a una cascada"));

        photoGallery.add(new PhotoModel("https://images.unsplash.com/photo-1688890239467-c43da335fe7e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw1MHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60",
                "Un pequeño animal parado en un campo de flores blancas"));

        photoGallery.add(new PhotoModel("https://images.unsplash.com/photo-1500862321-177c80d8ca32?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGJlZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
                "Fotografía macro de una abeja"));

        photoGallery.add(new PhotoModel("https://images.unsplash.com/photo-1688999558024-0bbeac1c0102?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8MTEzfHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60",
                "El primer plano de la cara de una leona"));

        photoGallery.add(new PhotoModel("https://images.unsplash.com/photo-1688732252178-d73dddea8464?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8MzE3fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60",
                "Un pequeño pajaro colorido sentado en una rama en la oscuridad"));

        return photoGallery;
    }

}