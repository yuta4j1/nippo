<template>
    <div class="content">
        <div class="row">
            <textarea id="title" cols="200" rows="1" placeholder="input title"></textarea>
        </div>
        <div class="row">
            <textarea id="editor" class="wide-textarea" rows="60" v-model="inputText"></textarea>
            <div id="previewer" class="wide-textarea" rows="60" v-html="parsedMarkdownText" readonly></div>
        </div>
    </div>    
</template>

<script>
import marked from 'marked'
import myMarked from '../myMarked'
export default {
    data: function() {
        return {
            inputText: ''
        }
    },
    computed: {
        parsedMarkdownText: function() {
            console.log(myMarked(this.inputText));
            return myMarked(this.inputText);
        },
    }
    
}
</script>


<style scoped>
@import url(https://cdn.jsdelivr.net/gh/tonsky/FiraCode@1.206/distr/fira_code.css);
.row {
    margin: 0px auto;
    display: flex;
    justify-content: center;
}

.content {
    font-family: 'Sarabun', sans-serif;
}

.content > .row > #title {
    margin: 20px 20px;
    font-size: 2.0rem
}

#title {
    border-radius: 5px;
    height: 30px;
}

#editor {
    box-shadow: 0px 0px 6px 0px #B3B3B3 inset;
    font-family: 'Sarabun', sans-serif;
}

#previewer {
    padding: 4px;
    border: solid;
    border-color: #C0C0C0;
    border-width: 1px;
}

.wide-textarea {
    width: 100%;
    font-size: 1.2rem;
    overflow: auto;
    border-color: #EEEEEE;
}

</style>
