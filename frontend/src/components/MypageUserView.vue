<template>

    <v-data-table
        :headers="headers"
        :items="mypageUser"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'MypageUserView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "userId", value: "userId" },
                { text: "serviceName", value: "serviceName" },
                { text: "serviceId", value: "serviceId" },
                { text: "subscribeDate", value: "subscribeDate" },
                { text: "subscribeTime", value: "subscribeTime" },
                { text: "serviceDate", value: "serviceDate" },
                { text: "subscriberNumber", value: "subscriberNumber" },
                { text: "", value: "" },
                { text: "", value: "" },
            ],
            mypageUser : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/mypageUsers'))

            temp.data._embedded.mypageUsers.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.mypageUser = temp.data._embedded.mypageUsers;
        },
        methods: {
        }
    }
</script>

