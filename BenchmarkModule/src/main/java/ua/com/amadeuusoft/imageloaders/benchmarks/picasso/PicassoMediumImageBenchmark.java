package ua.com.amadeuusoft.imageloaders.benchmarks.picasso;

import android.content.Context;
import android.widget.GridView;

import ua.com.amadeuusoft.imageloaders.adapters.BaseBenchmarkAdapter;
import ua.com.amadeuusoft.imageloaders.adapters.picasso.PicassoSquareAdapter;
import ua.com.amadeuusoft.imageloaders.benchmarks.ImageLoaderBenchmark;
import ua.com.amadeuusoft.imageloaders.containers.IUrlListContainer;
import ua.com.amadeuusoft.imageloaders.containers.LargeImagesUrlContainer;

/**
 * Created by Artem Manayenko on 30.03.2014.
 */
public class PicassoMediumImageBenchmark extends ImageLoaderBenchmark {

    public PicassoMediumImageBenchmark(GridView gridView) {
        super(gridView);
    }

    @Override
    protected BaseBenchmarkAdapter createBenchmarkAdapter(Context context) {
        IUrlListContainer listContainer = new LargeImagesUrlContainer();
        PicassoSquareAdapter adapter = new PicassoSquareAdapter(context, listContainer);
        return adapter;
    }

    @Override
    protected String getBenchmarkName() {
        return "Picasso";
    }

}
