package com.app.besthdwallpapers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private final Context context;

    public int[] imageArray = {

            R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5,
            R.drawable.image_6, R.drawable.image_7, R.drawable.image_8, R.drawable.image_9, R.drawable.image_10,
            R.drawable.image_11, R.drawable.image_12, R.drawable.image_13, R.drawable.image_14, R.drawable.image_15,
            R.drawable.image_16, R.drawable.image_17, R.drawable.image_18, R.drawable.image_19, R.drawable.image_20,
            R.drawable.image_21, R.drawable.image_22, R.drawable.image_23, R.drawable.image_24, R.drawable.image_25,
            R.drawable.image_26, R.drawable.image_27, R.drawable.image_28, R.drawable.image_29, R.drawable.image_30,
            R.drawable.image_31, R.drawable.image_32, R.drawable.image_33, R.drawable.image_34, R.drawable.image_35,
            R.drawable.image_36, R.drawable.image_37, R.drawable.image_38, R.drawable.image_39, R.drawable.image_40,
            R.drawable.image_41, R.drawable.image_42, R.drawable.image_43, R.drawable.image_44, R.drawable.image_45,
            R.drawable.image_46, R.drawable.image_47, R.drawable.image_48, R.drawable.image_49, R.drawable.image_50,
            R.drawable.image_51, R.drawable.image_52, R.drawable.image_53, R.drawable.image_54, R.drawable.image_55,
            R.drawable.image_56, R.drawable.image_57, R.drawable.image_58, R.drawable.image_59, R.drawable.image_60,
            R.drawable.image_61, R.drawable.image_62, R.drawable.image_63, R.drawable.image_64, R.drawable.image_65,
            R.drawable.image_66, R.drawable.image_67, R.drawable.image_68, R.drawable.image_69, R.drawable.image_70,
            R.drawable.image_71, R.drawable.image_72, R.drawable.image_73, R.drawable.image_74, R.drawable.image_75,
            R.drawable.image_76, R.drawable.image_77, R.drawable.image_78, R.drawable.image_79, R.drawable.image_80,
            R.drawable.image_81, R.drawable.image_82, R.drawable.image_83, R.drawable.image_84, R.drawable.image_85,
            R.drawable.image_86, R.drawable.image_87, R.drawable.image_88, R.drawable.image_89, R.drawable.image_90,
            R.drawable.image_91, R.drawable.image_92, R.drawable.image_93, R.drawable.image_94, R.drawable.image_95,
            R.drawable.image_96, R.drawable.image_97, R.drawable.image_98, R.drawable.image_99, R.drawable.image_100,
            R.drawable.image_101, R.drawable.image_102, R.drawable.image_103, R.drawable.image_104, R.drawable.image_105,
            R.drawable.image_106, R.drawable.image_107, R.drawable.image_108, R.drawable.image_109, R.drawable.image_110,
            R.drawable.image_111, R.drawable.image_112, R.drawable.image_113, R.drawable.image_114, R.drawable.image_115,
            R.drawable.image_116, R.drawable.image_117, R.drawable.image_118, R.drawable.image_119, R.drawable.image_120,
            R.drawable.image_121, R.drawable.image_122, R.drawable.image_123, R.drawable.image_124, R.drawable.image_125,
            R.drawable.image_126, R.drawable.image_127, R.drawable.image_128, R.drawable.image_129, R.drawable.image_130,
            R.drawable.image_131, R.drawable.image_132, R.drawable.image_133, R.drawable.image_134, R.drawable.image_135,
            R.drawable.image_136, R.drawable.image_137, R.drawable.image_138, R.drawable.image_139, R.drawable.image_140,
            R.drawable.image_141, R.drawable.image_142, R.drawable.image_143, R.drawable.image_144, R.drawable.image_145,
            R.drawable.image_146, R.drawable.image_147, R.drawable.image_148, R.drawable.image_149, R.drawable.image_150,
            R.drawable.image_151, R.drawable.image_152, R.drawable.image_153, R.drawable.image_154, R.drawable.image_155,
            R.drawable.image_156, R.drawable.image_157, R.drawable.image_158, R.drawable.image_159, R.drawable.image_160,
            R.drawable.image_161, R.drawable.image_162, R.drawable.image_163, R.drawable.image_164, R.drawable.image_165,
            R.drawable.image_166, R.drawable.image_167, R.drawable.image_168, R.drawable.image_169, R.drawable.image_170,
            R.drawable.image_171, R.drawable.image_172, R.drawable.image_173, R.drawable.image_174, R.drawable.image_175,
            R.drawable.image_176, R.drawable.image_177, R.drawable.image_178, R.drawable.image_179, R.drawable.image_180,
            R.drawable.image_181, R.drawable.image_182, R.drawable.image_183, R.drawable.image_184, R.drawable.image_185,
            R.drawable.image_186, R.drawable.image_187, R.drawable.image_188, R.drawable.image_189, R.drawable.image_190,
            R.drawable.image_191, R.drawable.image_192, R.drawable.image_193, R.drawable.image_194, R.drawable.image_195,
            R.drawable.image_196, R.drawable.image_197, R.drawable.image_198, R.drawable.image_199, R.drawable.image_200,
            R.drawable.image_201, R.drawable.image_202, R.drawable.image_203, R.drawable.image_204, R.drawable.image_205,
            R.drawable.image_206, R.drawable.image_207, R.drawable.image_208, R.drawable.image_209, R.drawable.image_210,
            R.drawable.image_211, R.drawable.image_212, R.drawable.image_213, R.drawable.image_214, R.drawable.image_215,
            R.drawable.image_216, R.drawable.image_217, R.drawable.image_218, R.drawable.image_219, R.drawable.image_220,
            R.drawable.image_221, R.drawable.image_222, R.drawable.image_223, R.drawable.image_224, R.drawable.image_225,
            R.drawable.image_226, R.drawable.image_227, R.drawable.image_228, R.drawable.image_229, R.drawable.image_230,
            R.drawable.image_231, R.drawable.image_232, R.drawable.image_233, R.drawable.image_234, R.drawable.image_235,
            R.drawable.image_236, R.drawable.image_237, R.drawable.image_238, R.drawable.image_239, R.drawable.image_240,
            R.drawable.image_241, R.drawable.image_242, R.drawable.image_243, R.drawable.image_244, R.drawable.image_245,
            R.drawable.image_246, R.drawable.image_247, R.drawable.image_248, R.drawable.image_249, R.drawable.image_250,
            R.drawable.image_251, R.drawable.image_252, R.drawable.image_253, R.drawable.image_254, R.drawable.image_255,
            R.drawable.image_256, R.drawable.image_257, R.drawable.image_258, R.drawable.image_259, R.drawable.image_260,
            R.drawable.image_261, R.drawable.image_262, R.drawable.image_263, R.drawable.image_264, R.drawable.image_265,
            R.drawable.image_266, R.drawable.image_267, R.drawable.image_268, R.drawable.image_269, R.drawable.image_270,
            R.drawable.image_271, R.drawable.image_272, R.drawable.image_273, R.drawable.image_274, R.drawable.image_275,
            R.drawable.image_276, R.drawable.image_277, R.drawable.image_278, R.drawable.image_279, R.drawable.image_280,
            R.drawable.image_281, R.drawable.image_282, R.drawable.image_283, R.drawable.image_284, R.drawable.image_285,
            R.drawable.image_286, R.drawable.image_287, R.drawable.image_288, R.drawable.image_289, R.drawable.image_290,
            R.drawable.image_291, R.drawable.image_292, R.drawable.image_293, R.drawable.image_294, R.drawable.image_295,
            R.drawable.image_296, R.drawable.image_297, R.drawable.image_298, R.drawable.image_299, R.drawable.image_300,
            R.drawable.image_301, R.drawable.image_302, R.drawable.image_303, R.drawable.image_304, R.drawable.image_305,
            R.drawable.image_306, R.drawable.image_307, R.drawable.image_308, R.drawable.image_309, R.drawable.image_310,
            R.drawable.image_311, R.drawable.image_312, R.drawable.image_313, R.drawable.image_314, R.drawable.image_315,
            R.drawable.image_316, R.drawable.image_317, R.drawable.image_318, R.drawable.image_319, R.drawable.image_320,
            R.drawable.image_321, R.drawable.image_322, R.drawable.image_323, R.drawable.image_324, R.drawable.image_325,
            R.drawable.image_326, R.drawable.image_327, R.drawable.image_328, R.drawable.image_329, R.drawable.image_330,
            R.drawable.image_331, R.drawable.image_332, R.drawable.image_333, R.drawable.image_334, R.drawable.image_335,
            R.drawable.image_336, R.drawable.image_337, R.drawable.image_338, R.drawable.image_339, R.drawable.image_340,
            R.drawable.image_341

    };

    public ImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(context);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(350,650));

        return imageView;
    }
}
