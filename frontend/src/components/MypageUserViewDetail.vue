<template>

    <v-card outlined>
        <v-card-title>
            MypageUser # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="UserId" v-model="item.userId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="ServiceName" v-model="item.serviceName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="ServiceId" v-model="item.serviceId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="SubscribeDate" v-model="item.subscribeDate" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="SubscribeTime" v-model="item.subscribeTime" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="ServiceDate" v-model="item.serviceDate" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="SubscriberNumber" v-model="item.subscriberNumber" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'MypageUserViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/mypageUsers/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

