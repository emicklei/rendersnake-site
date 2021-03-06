package org.rendersnake.site.example;

import java.io.IOException;

import org.rendersnake.HtmlCanvas;
import org.rendersnake.Renderable;
import org.rendersnake.StringResource;

public class InsideFooter implements Renderable {

    public void renderOn(HtmlCanvas html) throws IOException {

        html.h1().write("Footer component")._h1();

        html.render(StringResource.valueOf("content/Example-footer.html"));
    }
}
