<template>

    <v-data-table
        :headers="headers"
        :items="genreSearch"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'GenreSearchView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            genreSearch : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/genreSearches'))

            temp.data._embedded.genreSearches.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.genreSearch = temp.data._embedded.genreSearches;
        },
        methods: {
        }
    }
</script>

