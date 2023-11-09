<template>

    <v-data-table
        :headers="headers"
        :items="subscriptionHistory"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SubscriptionHistoryView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            subscriptionHistory : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/subscriptionHistories'))

            temp.data._embedded.subscriptionHistories.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.subscriptionHistory = temp.data._embedded.subscriptionHistories;
        },
        methods: {
        }
    }
</script>

