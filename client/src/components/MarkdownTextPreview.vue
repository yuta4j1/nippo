<template>
    <div class="content">
        <div>
            <textarea class="title" cols="50" rows="1"></textarea>
        </div>
        <div class="row">
            <div>1</div>
            <div>2</div>
            <div>3</div>
            <div>4</div>
        </div>
    </div>    
</template>

<style scoped>
.row {
    margin: 20px auto;
    max-width: 300px;
    display: flex;
}

.row > div {
    border: 1px dashed gray;
    flex: 1 1 auto;
    text-align: center;
    padding: 12px;
}
</style>
