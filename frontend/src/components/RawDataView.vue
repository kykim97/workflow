<template>

    <v-data-table
        :headers="headers"
        :items="rawData"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'RawDataView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "dataType", value: "dataType" },
            ],
            rawData : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/rawData'))

            temp.data._embedded.rawData.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.rawData = temp.data._embedded.rawData;
        },
        methods: {
        }
    }
</script>

