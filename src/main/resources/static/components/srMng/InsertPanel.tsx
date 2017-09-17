import * as React from 'react';
import 'whatwg-fetch';


class InsertPanel extends React.Component<any, any> {
    constructor (props: any) {
        super(props);
        this.state = {
            resultText: 'button initialized'
        }
    }

    insertBatch () {
        const me = this;
        fetch('/srMng/insertBatch', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            }
        })
            .then(resp => resp.text())
            .then(body => me.setState({resultText: body}));
    }

    insertOne () {
        const me = this;
        fetch('/srMng/insert', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            }
        })
            .then(resp => resp.text())
            .then(body => me.setState({resultText: body}));
    }
    render () {
        const resultText = this.state.resultText;
        return <div>
            <p>{resultText}</p>
            <button type="button" className="btn btn-primary" onClick={this.insertOne.bind(this)}>INSERT(1건)</button>
            <button type="button" className="btn btn-secondary" onClick={this.insertBatch.bind(this)}>INSERT(배치)</button>
        </div>
    }
}

export default InsertPanel