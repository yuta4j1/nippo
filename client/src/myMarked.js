import myMarked from 'marked'
import hljs from 'highlight.js'
import 'highlight.js/styles/github.css';
import javascript from 'highlight.js/lib/languages/javascript';
hljs.registerLanguage('javascript', javascript);

const renderer = new myMarked.Renderer();
renderer.heading = function(text, level) {
    if (level <= 2) {
        return `<h${level} style="margin-bottom: 0; padding-bottom: 0;">${text}</h${level}><hr size="1" color="#EEEEEE" style="margin-top: 0;">`;
    } else {
        return `<h${level}>${text}</h${level}>`
    }
}

renderer.code = function(code, language) {
    return `<pre><code class="hljs" style="font-family: 'Fira Code', monospace;">${hljs.highlightAuto(code).value}</code></pre>`
}

myMarked.setOptions({
    renderer: renderer,
    highlight: function(code) {
        highlight.highlightAuto(code).value;
    }
});

export default myMarked;