package com.example.lemon.data

import com.example.lemon.R
import com.example.lemon.model.NatureAffirmation

class Datasource {
        fun load(): MutableList<NatureAffirmation> {
            return mutableListOf<NatureAffirmation> (
                NatureAffirmation(R.string.affirmation1, R.drawable.nz4),
                NatureAffirmation(R.string.affirmation1, R.drawable.nz4) ,
                NatureAffirmation(R.string.affirmation1, R.drawable.nz4) ,
                NatureAffirmation(R.string.affirmation1, R.drawable.nz4) ,
                NatureAffirmation(R.string.affirmation1, R.drawable.nz4) ,
                NatureAffirmation(R.string.affirmation1, R.drawable.nz4) ,
                NatureAffirmation(R.string.affirmation1, R.drawable.nz4) ,
                NatureAffirmation(R.string.affirmation1, R.drawable.nz4) ,
                NatureAffirmation(R.string.affirmation1, R.drawable.nz4) ,
            )
        }
}