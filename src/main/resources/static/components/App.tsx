import * as React from 'react';
import 'whatwg-fetch';
import PageHeader from './headers/PageHeader';
import SrMngContainer from './srMng/SrMngContainer';


export default class App extends React.Component<any, any> {
    render () {
        return <div>
            <PageHeader />
            <SrMngContainer />
        </div>
    }
}