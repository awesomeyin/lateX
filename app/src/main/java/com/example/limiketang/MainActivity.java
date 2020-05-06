package com.example.limiketang;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.limiketang.core.AjLatexMath;

import java.util.ArrayList;
import java.util.List;

import io.github.kbiakov.codeview.classifier.CodeProcessor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CodeProcessor.init(this);
        AjLatexMath.init(this); // init library: load fonts, create paint, etc.
        List<Attachment> attachments = new ArrayList<>();
//        attachments.add(new ExampleAttachment("Android Image", "53ce1", true, "http://tse1.mm.bing.net/th?id=OIP.M24baa78c1fb80a71891ce775d11e038ao0&w=166&h=166&c=7&qlt=90&o=4&pid=1.7"));
//        attachments.add(new ExampleAttachment("Here is a link", "bc41a", false, "https://google.com"));

        FlexibleRichTextView flexibleRichTextView = (FlexibleRichTextView) findViewById(R.id.frtv);

        TextView gstv = findViewById(R.id.gstv);
        Tokenizer.setCenterStartLabels("<center>");
        Tokenizer.setCenterEndLabels("</center>");
        Tokenizer.setTitleStartLabels("<h>");
        Tokenizer.setTitleEndLabels("</h>");

//        flexibleRichTextView.setText("<h><center>hi!</center></h>" +
//                        "[quote]This is quote\n" +
//                        "second line\n" +
//                        "third line\n" +
//                        "fourth line[/quote]" +
//                        "Here is an attachment:[attachment:53ce1]" +
//                        "[code]print(\"Hello FlexibleRichTextView!\")[/code]" +
//                        "Hello FlexibleRichTextView!\n" +
//                        "This is LaTeX:\n" +
//                        "$e^{\\pi i} + 1 = 0$\n" +
//                        "This is table:\n" +
//                        "| First Header  | Second Header |\n" +
//                        "| --- | --- |\n" +
//                        "| Content Cell  | Content Cell  |\n" +
//                        "| Content Cell  | Content Cell  |\n" +
//                        "An attachment is shown at the bottom: \n",
//                attachments);
        //TODO  测试

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("$$3^2$$");
        stringBuilder.append("\n\n");
        stringBuilder.append("$$\\frac{1}{2}$$");
        stringBuilder.append("\n\n\n");
        stringBuilder.append("$$\\sqrt[2]{3} $$");
        stringBuilder.append("\n\n");
        stringBuilder.append("$$3\\frac{1}{2} $$");
        stringBuilder.append("\n\n\n");
        stringBuilder.append("$$X_a$$");
        stringBuilder.append("\n\n\n");
        stringBuilder.append("$$B_a$$");
        stringBuilder.append("\n\n\n");
        stringBuilder.append("$${A_1}{B_1}$$");
        stringBuilder.append("\n\n\n");
        stringBuilder.append("$$A_1$$");
        stringBuilder.append("\n\n\n");
        stringBuilder.append("$$a_1$$");
        stringBuilder.append("\n\n");

        flexibleRichTextView.setText(stringBuilder.toString());

        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(" 对应公式=> $$3^2$$");
        stringBuilder1.append("\n\n\n");
        stringBuilder1.append(" 对应公式=> $$\\\\frac{1}{2}$$");
        stringBuilder1.append("\n\n\n");
        stringBuilder1.append(" 对应公式=> $$\\\\sqrt[2]{3} $$");
        stringBuilder1.append("\n\n\n");
        stringBuilder1.append(" 对应公式=> $$3\\\\frac{1}{2} $$");
        stringBuilder1.append("\n\n\n");
        stringBuilder1.append(" 对应公式=> $$X_a$$");
        stringBuilder1.append("\n\n\n");
        stringBuilder1.append(" 对应公式=> $$B_a$$");
        stringBuilder1.append("\n\n\n");
        stringBuilder1.append(" 对应公式=> $${A_1}{B_1}$$");
        stringBuilder1.append("\n\n\n");
        stringBuilder1.append(" 对应公式=> $$A_1$$");
        stringBuilder1.append("\n\n\n");
        stringBuilder1.append(" 对应公式=> $$a_1$$");
        stringBuilder1.append("\n\n\n");
        gstv.setText(stringBuilder1.toString());
    }
}
