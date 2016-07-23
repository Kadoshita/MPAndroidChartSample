package com.example.mpandroidchartsample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BarChartActivity extends AppCompatActivity {

    private BarChart mBarChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        mBarChart=(BarChart)findViewById(R.id.BarChart);
        setupBarChart();
    }
    private void setupBarChart(){
        mBarChart.setDescription("棒グラフ");

        Legend legend=mBarChart.getLegend();
        legend.setPosition(Legend.LegendPosition.BELOW_CHART_LEFT);

        //棒グラフに表示するデータ
        List<Float> values = Arrays.asList(85f, 78f, 59f, 63f);
        List<BarEntry> entries = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            entries.add(new BarEntry(values.get(i), i));
        }
        BarDataSet dataSet=new BarDataSet(entries, "ラベル");
        dataSet.setBarBorderColor(ColorTemplate.COLORFUL_COLORS[4]);
        dataSet.setDrawValues(true);

        List<String> labels=Arrays.asList("前期中間","前期期末","後期中間","後期期末");
        BarData barData=new BarData(labels,dataSet);
        barData.setValueFormatter(new PercentFormatter());
        barData.setValueTextSize(12f);
        barData.setValueTextColor(Color.WHITE);

        mBarChart.setData(barData);


    }
}
