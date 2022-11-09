<template>

    <v-card outlined>
        <v-card-title>
            RawData # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="DataType" v-model="item.dataType" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'RawDataViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/rawData/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

