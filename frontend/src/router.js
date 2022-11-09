
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import WorkflowHistManager from "./components/listers/WorkflowHistCards"
import WorkflowHistDetail from "./components/listers/WorkflowHistDetail"
import WorkflowHistManager from "./components/listers/WorkflowHistCards"
import WorkflowHistDetail from "./components/listers/WorkflowHistDetail"

import RawDataView from "./components/RawDataView"
import RawDataViewDetail from "./components/RawDataViewDetail"
import ProcessedDataManager from "./components/listers/ProcessedDataCards"
import ProcessedDataDetail from "./components/listers/ProcessedDataDetail"
import ProcessedDataManager from "./components/listers/ProcessedDataCards"
import ProcessedDataDetail from "./components/listers/ProcessedDataDetail"

import RawDataView from "./components/RawDataView"
import RawDataViewDetail from "./components/RawDataViewDetail"
import RawDataView from "./components/RawDataView"
import RawDataViewDetail from "./components/RawDataViewDetail"
import InferenceResultManager from "./components/listers/InferenceResultCards"
import InferenceResultDetail from "./components/listers/InferenceResultDetail"
import InferenceResultManager from "./components/listers/InferenceResultCards"
import InferenceResultDetail from "./components/listers/InferenceResultDetail"

import ProcessedDataView from "./components/ProcessedDataView"
import ProcessedDataViewDetail from "./components/ProcessedDataViewDetail"
import ProcessedDataView from "./components/ProcessedDataView"
import ProcessedDataViewDetail from "./components/ProcessedDataViewDetail"
import RawDataManager from "./components/listers/RawDataCards"
import RawDataDetail from "./components/listers/RawDataDetail"
import RawDataManager from "./components/listers/RawDataCards"
import RawDataDetail from "./components/listers/RawDataDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/workflowHists',
                name: 'WorkflowHistManager',
                component: WorkflowHistManager
            },
            {
                path: '/workflowHists/:id',
                name: 'WorkflowHistDetail',
                component: WorkflowHistDetail
            },
            {
                path: '/workflowHists',
                name: 'WorkflowHistManager',
                component: WorkflowHistManager
            },
            {
                path: '/workflowHists/:id',
                name: 'WorkflowHistDetail',
                component: WorkflowHistDetail
            },

            {
                path: '/rawData',
                name: 'RawDataView',
                component: RawDataView
            },
            {
                path: '/rawData/:id',
                name: 'RawDataViewDetail',
                component: RawDataViewDetail
            },
            {
                path: '/processedData',
                name: 'ProcessedDataManager',
                component: ProcessedDataManager
            },
            {
                path: '/processedData/:id',
                name: 'ProcessedDataDetail',
                component: ProcessedDataDetail
            },
            {
                path: '/processedData',
                name: 'ProcessedDataManager',
                component: ProcessedDataManager
            },
            {
                path: '/processedData/:id',
                name: 'ProcessedDataDetail',
                component: ProcessedDataDetail
            },

            {
                path: '/rawData',
                name: 'RawDataView',
                component: RawDataView
            },
            {
                path: '/rawData/:id',
                name: 'RawDataViewDetail',
                component: RawDataViewDetail
            },
            {
                path: '/rawData',
                name: 'RawDataView',
                component: RawDataView
            },
            {
                path: '/rawData/:id',
                name: 'RawDataViewDetail',
                component: RawDataViewDetail
            },
            {
                path: '/inferenceResults',
                name: 'InferenceResultManager',
                component: InferenceResultManager
            },
            {
                path: '/inferenceResults/:id',
                name: 'InferenceResultDetail',
                component: InferenceResultDetail
            },
            {
                path: '/inferenceResults',
                name: 'InferenceResultManager',
                component: InferenceResultManager
            },
            {
                path: '/inferenceResults/:id',
                name: 'InferenceResultDetail',
                component: InferenceResultDetail
            },

            {
                path: '/processedData',
                name: 'ProcessedDataView',
                component: ProcessedDataView
            },
            {
                path: '/processedData/:id',
                name: 'ProcessedDataViewDetail',
                component: ProcessedDataViewDetail
            },
            {
                path: '/processedData',
                name: 'ProcessedDataView',
                component: ProcessedDataView
            },
            {
                path: '/processedData/:id',
                name: 'ProcessedDataViewDetail',
                component: ProcessedDataViewDetail
            },
            {
                path: '/rawData',
                name: 'RawDataManager',
                component: RawDataManager
            },
            {
                path: '/rawData/:id',
                name: 'RawDataDetail',
                component: RawDataDetail
            },
            {
                path: '/rawData',
                name: 'RawDataManager',
                component: RawDataManager
            },
            {
                path: '/rawData/:id',
                name: 'RawDataDetail',
                component: RawDataDetail
            },



    ]
})
